import java.util.*;


class Solution {
    private static class Point{
        public final long x, y;

        private Point(long x, long y){
            this.x = x;
            this.y = y;
        };
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){ //두 교점의 좌표 구하기
        double x = (double) (b1*c2 - b2*c1) / (a1*b2 - a2*b1);
        double y = (double) (a2*c1 - a1*c2) / (a1*b2 - a2*b1);

        if (x % 1 != 0 || y % 1 != 0) return null; // 정수만 반환 하기
        return new Point((long) x, (long) y);
    };


    private Point getMinimumPoint(List<Point> points) { // 정수인 교점 x,y의 최소값 구하기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points){
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        };
        return new Point(x, y);
    };

    private Point getMaximumPoint(List<Point> points){ // 정수인 교점 x,y의 최대값 구하기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points){
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        };
        return new Point(x, y);
    }

    public String[] solution(int[][] line) {
        String[] answer = {};
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < line.length; i++) {  // i번째 직선과 교차하는 점에서 정수만 탐색
            for(int j=i+1; j < line.length; j++){
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if( intersection != null) {
                    points.add(intersection);
                }
            };
        };
        Point minimum = getMinimumPoint(points);  // 2차원 배열의 크기 결정
        Point maximum = getMaximumPoint(points);
        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width]; //크기가 결정된 배열에 '.' 채워주기
        for(char[] row: arr){
            Arrays.fill(row, '.');
        };

        for (Point p : points){  //2차원 배열에는 -값 좌표가 없고, 0 부터 시작하는 값에서 최대값과 최소값과의 크기 차이를 이용해서 좌표를 결정해야 함
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        };

        String[] result = new String[arr.length];
        for(int i = 0; i <result.length; i++) {
            result[i] = new String(arr[i]);
        };

        return answer = result;

    }
}

