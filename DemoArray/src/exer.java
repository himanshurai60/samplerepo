
public class exer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar= {12,34,44,54,34,55,65,78,90,23,90};
int i=0;
boolean flag=false;
int search=54;
while(i<ar.length)
{
	if(ar[i]==search)
		flag=true;
	i++;
}
if(flag)
	System.out.println("value found");
else
	System.out.println("not found");

int data=0;
if(data)
	

i=0;
System.out.println();
do
{
	System.out.print(ar[i]+"\t");
i++;
}while(i<ar.length);
	}

}
