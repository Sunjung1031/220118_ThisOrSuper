package super��������;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		//��ü���� ���� => �޼ҵ� ȣ��
		sa.takeoff();
		sa.fly();  //�ڽ� �޼ҵ� ȣ��
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();  //�ڽ� �޼ҵ� ȣ��
		//sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();  //�ڽ� �޼ҵ� ȣ�� 
		sa.land();
		/*
		�̷��մϴ�.
		�Ϲ� �����Դϴ�.
		������ �����մϴ�.
		�Ϲ� �����Դϴ�.
		�����մϴ�.
		*/
	}

}
