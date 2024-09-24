import java.util.Scanner;
public class Sgc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("STUDENT GRADE CALCULATOR");
System.out.println("enter number of subjects:");
int n=sc.nextInt();
int total=0;
for(int i=0;i<n;i++) {
System.out.println("Enter marks obtained in Subject "+(i+1)+" :");
int marks=sc.nextInt();
total=total+marks;
}
double avgPer = (double)total/n;
char Grade;
if(avgPer >= 90){
 Grade ='S';
}
else if(avgPer >= 80) {
Grade ='A';
}
else if(avgPer >= 70) {
Grade ='B';
}
else if(avgPer >= 60) {
Grade ='C';
}

else if(avgPer >= 50) {
Grade ='D';
}

else if(avgPer >= 40) {
Grade ='E';
}
else {
 Grade ='F';
}
System.out.println("total marks scored is:"+total);
System.out.println("Average percentage obtained is:"+avgPer);
System.out.println("Grade :"+Grade);
}
}




