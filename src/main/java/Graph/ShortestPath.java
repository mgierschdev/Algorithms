package Graph;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.*;

public class ShortestPath {
    private int[][] grid;
    private List<Integer> path;
    private boolean targetReached = false;

    public ShortestPath(int[][] grid) {
        this.grid = grid;
    }

    // Cost Matrix based on the Euclidean distance between 2 points
    private int getCost(int[] a, int[] b){
        return  (int)(Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2)));
    }

    // 1 = obstacle, -1 = visited, 2 = added to queue for diagonals
    private void addPointToQueue(int x, int y, Queue<int[]> q, int[][] visited){
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && visited[x][y] != -1 && visited[x][y] != 1 && visited[x][y] != 2){
            visited[x][y] = 2;
            q.add(new int[]{x, y});
        }
    }

    private void calculateBFS(int[] start, int[] goal){
        System.out.println("Calculating A*");
        // making a copy of the grid
        int[][] visited = Arrays.stream(grid).map((int[] row) -> row.clone()).toArray((int length) -> new int[length][]);
        // Now we do BFS minimizing the function getCost
        Queue<int[]> queue = new LinkedList<>();
        visited[start[0]][start[1]] = -1;
        queue.add(start);
        int level = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            System.out.println("Queue size "+size);

            while(size -- > 0) {
                int[] point = queue.poll();
                visited[point[0]][point[1]] = -1;

                if(point[0] == goal[0] && point[1] == goal[1]){
                    System.out.println("Target reached ");
                    queue.clear();
                    break;
                }

                addPointToQueue(point[0] + 1, point[1], queue, visited);
                addPointToQueue(point[0] - 1, point[1], queue, visited);
                addPointToQueue(point[0], point[1] + 1, queue, visited);
                addPointToQueue(point[0], point[1] - 1, queue, visited);
                // diagonal
                addPointToQueue(point[0] + 1, point[1] - 1, queue, visited);
                addPointToQueue(point[0] - 1, point[1] + 1, queue, visited);
                addPointToQueue(point[0] + 1, point[1] + 1, queue, visited);
                addPointToQueue(point[0] - 1, point[1] - 1, queue, visited);
            }
            System.out.println("Going Level " + level);
            level++;
            //end level one
            printArray(visited);
        }

    }

    private void calculateDFS(int[] start, int[] goal){
        int[][] visited = Arrays.stream(grid).map((int[] row) -> row.clone()).toArray((int length) -> new int[length][]);
        DFS(start, goal, visited);
    }

    public boolean DFS(int[] current, int[] target, int[][] visited){
        if(current[0] >= 0 && current[0] < visited.length && current[1] >= 0 && current[1] < visited[0].length && grid[current[0]][current[1]] != 1 && grid[current[0]][current[1]] != -1 && !targetReached){

            if(current[0] == target[0] && current[1] == target[1]){
                System.out.println("Target reached ");
                return true;
            }
            printArray(visited);
            visited[current[0]][current[1]] = - 1;
            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> getCost(a, target) - getCost(b, target) );
            queue.add(new int[]{current[0] + 1, current[1]});
            queue.add(new int[]{current[0] - 1, current[1]});
            queue.add(new int[]{current[0], current[1] + 1});
            queue.add(new int[]{current[0], current[1] - 1});
            queue.add(new int[]{current[0] + 1, current[1] + 1});
            queue.add(new int[]{current[0] - 1, current[1] - 1});
            queue.add(new int[]{current[0] + 1, current[1] - 1});
            queue.add(new int[]{current[0] - 1, current[1] + 1});

            while(!queue.isEmpty()){
                if(DFS(queue.poll(), target, visited)){
                    targetReached = true;
                    System.out.println("Target reached");
                    break;
                }
            }
        }
        return false;
    }

    public List<Integer> getPath(int[] a, int[] b) {
        printArray(grid);
        int[] startPosition = a;
        int[] targetPosition = b;
        calculateDFS(a, b);
        return new LinkedList<>();
    }

    private void printArray(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
}
