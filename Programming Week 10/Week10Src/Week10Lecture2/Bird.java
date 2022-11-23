package Week10Lecture2;

public class Bird implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("peck");
	}

	@Override
	public void travel(int distance) {
		// TODO Auto-generated method stub
		System.out.println("flew"+distance);
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Tweet";
	}

}
