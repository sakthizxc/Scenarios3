class Samsung extends FactoryDemo{
static int price=5000;
public static void main(String []args)
{
Samsung sam=new Samsung();
sam.browse();
System.out.println(sam.price);
sam.verifyFingerPrint();
sam.providePattern();
sam.receiveCall();
sam.call(10);
sam.sendMesssage();
}
public void verifyFingerPrint()
{
System.out.println("as");
}
public void providePattern()
{
System.out.println("fg");
}
public void receiveCall()
{
System.out.println("fgjh");
}
public int call(int seconds)
{
System.out.println("kk");
return seconds;
}
public void sendMesssage()
{
System.out.println("gfd");
}
}




