package es.studium.Aleatorios;
import java.util.Random;
public class Aleatorios
{
public static void main(String[] args)
{
Random rnd=new Random();
int i,x;

for(i=0;i<10;i++)
{
x=rnd.nextInt(6)+1;
System.out.println(x);
}
}
}

