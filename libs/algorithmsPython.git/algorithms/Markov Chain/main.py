import numpy as np
from fractions import Fraction
from fractions import gcd
import unittest

# date: October 1, 2020
# @author: Maximiliam Gierschmann
#
# Time Complexity: O(n^3)
#  Taking into consideration that what takes
#  O(n^3) is the call to np.linalg.inv in the worst case scenario
# Space Complexity: O(n)
#  where n is the size of the input matrix

# Solution description:
#  I am taking the input and treating it  as a Absorbing Markov Chain,
#  in which each "Terminate Markov State" is an absorbing node (a node which
#  has no output). Instead of calculating all the probabilities in which T0 - Tk
#  (being T one count on each change of state), there is a mathematical proof in
#  which the absorbing probabilities for every other node to any other node in the
#  Chain = (I - Q)^-1. I = Identity  Matrix, Q (a generated probability matrix),
#  to the inverse. Since we are only interested in S0, I take the first row
#  of that matrix and we have our result. The terminate state nodes are the ones
#  in the input matrix with row's = 0. We compute the Greatest Common Denominator in
#  order to display the result.

endNodesSet = set()  # Meaning rows with only 0 (terminate nodes) are markov absorbing nodes
finalResult = list()  # Will contain the result in the final format

def addPercentages(matrix):
    global endNodesSet
    dividedMatrix = []
    index = 0

    for i in matrix:
        # we get the  sum of all the column so we can divided by each value
        total = np.sum(i)
        if total != 0:
            # dividing matrix to get the probability
            dividedMatrix.append(np.true_divide(i, total))
        else:
            endNodesSet.add(index)
            dividedMatrix.append(np.zeros(len(i)))
        index += 1

    return dividedMatrix

def getFractions(array):
    global endNodesSet
    global finalResult
    tmp = []

    for i in array:
        tmp.append(Fraction(i).limit_denominator())

    # we dont need the gcdm of all nodes, only the ones included in the result
    gcdmNodes = []
    index = 0
    while index < len(tmp):
        if index in endNodesSet:
            gcdmNodes.append(tmp[index])
        index += 1

    gcdm = reduce(lambda x, y: gcd(x, y), gcdmNodes)
    index = 0

    # we set up the final result array
    while index < len(tmp):
        if index in endNodesSet:
            # if it is a terminal node
            divisor = gcdm.denominator / tmp[index].denominator
            finalResult.append(int(float(tmp[index].numerator) * divisor))
        index += 1
    finalResult.append(gcdm.denominator)

def solution(m):
    # we create an identity matrix
    identityMatrix = np.identity(len(m))
    identityMatrix.astype(float)

    # convert the array to a numpy array
    m = np.array(m)
    m.astype(float)

    # we add the probability to convert from each node to each node
    # O(n)
    m = addPercentages(m)

    # we subtract to the identity the probability matrix
    # at least O(n * m)
    iSubtract = np.subtract(identityMatrix, m)

    # we apply the inverse to the subtraction
    # Worst case O(n ^ 3)
    resultAll = np.linalg.inv(iSubtract)

    # we have the result of the probability of going from S0 to every other node
    # we are only interested in S0
    resultS0 = resultAll[0]

    # we need to get the Greater Common divisor and append it to the final result
    # Worst case O(n)
    getFractions(resultS0)

    return finalResult

class TestMarkov(unittest.TestCase):

    def testBaseCase(self):
        arr = [
            [0, 1, 0, 0, 0, 1],
            [4, 0, 0, 3, 2, 0],
            [0, 0, 0, 0, 0, 0],
            [0, 2, 0, 0, 1, 0],
            [2, 0, 0, 0, 0, 0],
            [2, 6, 2, 0, 4, 0]
        ]

        self.assertEqual(solution(arr), [1, 1])

    def testSecondBaseCase(self):
        arr = [
            [0, 1, 0, 0, 0, 1],
            [4, 0, 0, 3, 2, 0],
            [0, 0, 0, 0, 0, 0],
            [0, 2, 0, 0, 1, 0],
            [2, 0, 0, 0, 0, 0],
            [2, 6, 2, 0, 4, 0]
        ]

        self.assertEqual(solution(arr), [1, 1, 1, 1])

unittest.main()