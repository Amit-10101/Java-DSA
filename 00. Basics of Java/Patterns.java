public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Upright Star:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nInverted Star:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nUpright Number:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nInverted Number:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        char ch = 'A';
        System.out.println("\nAlphabetical:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        char ich = 'A';
        System.out.println("\nInverted Alphabetical:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(ich + " ");
                ich++;
            }
            System.out.println();
        }

        System.out.println("\nFloyd's Triangle:");
        int ft = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ft + " ");
                ft++;
            }
            System.out.println();
        }
        
        System.out.println("\nInverted Floyd's Triangle:");
        int ift = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(ift + " ");
                ift++;
            }
            System.out.println();
        }
        
        System.out.println("\nInverted & Rotated Half Star Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= (n-i+1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n0-1 Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((((i + j) % 2) ^ 1) + " ");
            }
            System.out.println();
        }

        System.out.println("\nButterfly Pattern:");
        // print the top half of the butterfly
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print the bottom half of the butterfly
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(i-1); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nNumber Pyramid Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nPalindromic Number Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nSolid Rhombus Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nHollow Rhombus Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\nDiamond Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nNumber Inward Rectangle Pattern:");
        int size = 2 * n - 1;
        int front = 0;
        int back = size - 1;
        int[][] a = new int[size][size];

        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back; j++) {
                    if (i == front || i == back || j == front || j == back) {
                        a[i][j] = n;
                    }
                }
            }
            ++front;
            --back;
            --n;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
