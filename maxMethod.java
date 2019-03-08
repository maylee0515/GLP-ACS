  public static int max(int data[]) {
        int max = 0;
        int datalength = data.length;
        for (int i = 0; i < datalength; i++) {
            if (data[i] > max) {
            max = data[i];
            }
        }
        return max;
        }
