package super��������;

public class SupersonicAirplane extends Airplane{
	//��� ���� => ���� ����ϴ� ���������� ����� ��������ν� �������� �����ش�.
	public static final int NORMAL = 1; //�Ϲ� ����
	public static final int SUPERSONIC = 2; //������ ����
	
	//������� ����
	public int flymode = NORMAL; 
	
	@Override //�޼ҵ� �������̵� => �������� �����ϱ� ���� ���� 
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}else {
			super.fly(); //�θ�Ŭ������ fly() �޼ҵ� ȣ���ϰڴ� �ǹ�
		}
	
	}
	
}

