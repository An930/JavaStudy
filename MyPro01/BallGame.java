import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame
{
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;//С��ĺ�����
	double y = 100;//С���������
	boolean right = true;
	
	//�����ڵķ���
	public void paint(Graphics g)
	{
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right)
		{
			x = x + 5;	
		}
		else
		{
			x = x - 5;
		}
		if(x > 856 - 40 - 30)//856�Ǵ��ڿ�ȣ�40�����ӱ߿�Ŀ�ȣ�30��С���ֱ��
		{
			right = false;
		}
		if(x < 40)//40�����ӱ߿�Ŀ��
		{
			right = true;
		}
		
	}
	//���ڼ���
	void launchFrame()
	{
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//�ػ����ڣ�ÿ�뻭25��
		while(true)
		{
			repaint();
			try
			{
				Thread.sleep(40);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
	//main�����ǳ���ִ�е����
	public static void main(String[] args)
	{
		System.out.println("������Ϸ�����ڿ�ʼ��");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}

