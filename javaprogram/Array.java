package array;
public class Array {
public static void main(String [] args) {

int num = 1;

int [][] a = new int [3][3];

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
a[i][j]=num;
++num;
}
}

System.out.println("Three Dimensional array is: ");

for(int i=0;i<3;i++){
System.out.println();
for(int j=0;j<3;j++){
System.out.print(" "+a[i][j]+" ");
}
}
System.out.println();
}
}
