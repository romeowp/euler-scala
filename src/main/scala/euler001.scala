object euler001 extends App{

  println(List.range(3,1000).filter(x =>x%3==0 ||x%5==0).sum)

}