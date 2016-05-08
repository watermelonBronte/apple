package com.mars.tools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * 2010-8-5
 * 
 * @author mkk 
 * 实现时间选择器
 */
public class TimeFrame implements ActionListener {

	/**
	 * constructor
	 */
	TimeFrame() {
		this.calendar = Calendar.getInstance();
		this.year1 = this.calendar.get(Calendar.YEAR);
		this.month1 = this.calendar.get(Calendar.MONTH);
		this.day1 = this.calendar.get(Calendar.DAY_OF_MONTH);
		this.years = new String[DEFAULT_SHOW_YEARS];
		this.months = new String[12];
		// init
		this.initDatas();
	}

	/**
	 * 初始化数据
	 */
	private void initDatas() {
		// init months
		for (int i = 0; i < this.months.length; i++) {
			this.months[i] = " " + formatDay(i + 1);
		}
		// init years
		int start = this.year1 - 50;
		for (int i = start; i < start + 100; i++) {
			this.years[i - start] = String.valueOf(i);
		}
		// 设置时分秒为0
		this.calendar.set(Calendar.HOUR_OF_DAY, 0);
		this.calendar.set(Calendar.MINUTE, 0);
		this.calendar.set(Calendar.SECOND, 0);

	}

	/**
	 * 设置UI 默认为windows
	 */
	private static void setUI() {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
			System.out.println("Exception UI: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				setUI();
				TimeFrame frame = new TimeFrame();
				frame.showFrame();
			}
		});
	}

	/**
	 * 根据界面的长度与宽度确定界面的左上角坐标值
	 * 
	 * @param width
	 *            长度
	 * @param height
	 *            宽度
	 * @return
	 */
	private Dimension getStartDimension(int width, int height) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		dim.width = dim.width / 2 - width / 2;
		dim.height = dim.height / 2 - height / 2;
		return dim;
	}

	private void showFrame() {
		f = new JFrame("时间选择器");
		// 北面面板
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel3.setBackground(Color.WHITE);
		showNorthPanel(panel3);
		f.add(panel3, BorderLayout.NORTH);
		// 中间面板
		f.add(printCalendar(), BorderLayout.CENTER);
		// 南边面板
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.showSouthPanel(panel2);
		f.add(panel2, BorderLayout.SOUTH);

		// frame set
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		Dimension dim = getStartDimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		f.setLocation(dim.width, dim.height);
		f.setVisible(true);
	}

	/**
	 * 显示北面面板
	 * 
	 * @param panel
	 */
	private void showNorthPanel(JPanel panel) {
		this.button2 = new JButton("上一月");
		this.button2.setForeground(new Color(190,10,210));
		this.button2.setToolTipText("上一月");
		this.button2.addActionListener(this);
		panel.add(this.button2);
		this.comboBox1 = new JComboBox(this.years);
		this.comboBox1.setSelectedItem(String.valueOf(year1));
		this.comboBox1.setToolTipText("选择年份");
		this.comboBox1.setMaximumRowCount(rowlens);
		this.comboBox1.setActionCommand("year");
		this.comboBox1.addActionListener(this);
		panel.add(this.comboBox1);
		this.comboBox2 = new JComboBox(this.months);
		this.comboBox2.setSelectedItem(" " + formatDay(month1 + 1));
		this.comboBox2.setToolTipText("选择月份");
		this.comboBox2.setMaximumRowCount(rowlens);
		this.comboBox2.addActionListener(this);
		this.comboBox2.setActionCommand("month");
		panel.add(this.comboBox2);
		this.button3 = new JButton("下一月");
		this.button3.setForeground(new Color(90,10,210));
		this.button3.setToolTipText("下一月");
		this.button3.addActionListener(this);
		panel.add(this.button3);
	}

	/**
	 * 显示南边面板信息
	 * 
	 * @param panel
	 */
	private void showSouthPanel(JPanel panel) {
		// 选择时间的界面
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		JLabel label21 = new JLabel("时间: ");
		label21.setForeground(Color.GRAY);
		panel_23.add(label21);
		this.comboBox3 = new JComboBox(this.getHours());
		this.comboBox3.setMaximumRowCount(rowlens);
		this.comboBox3.setToolTipText("时");
		this.comboBox3.setActionCommand("hour");
		this.comboBox3.addActionListener(this);
		panel_23.add(this.comboBox3);
		JLabel label22 = new JLabel("时 ");
		label22.setForeground(Color.GRAY);
		panel_23.add(label22);
		this.comboBox4 = new JComboBox(this.getMins());
		this.comboBox4.setToolTipText("分");
		this.comboBox4.setMaximumRowCount(rowlens);
		this.comboBox4.setActionCommand("minute");
		this.comboBox4.addActionListener(this);
		panel_23.add(this.comboBox4);
		JLabel label23 = new JLabel("分 ");
		label23.setForeground(Color.GRAY);
		panel_23.add(label23);
		this.comboBox5 = new JComboBox(this.getMins());
		this.comboBox5.setToolTipText("秒");
		this.comboBox5.setActionCommand("second");
		this.comboBox5.addActionListener(this);
		this.comboBox5.setMaximumRowCount(rowlens);
		panel_23.add(this.comboBox5);
		JLabel label24 = new JLabel("秒");
		label24.setForeground(Color.GRAY);
		panel_23.add(label24);
		panel.add(panel_23);
		this.button1 = new JButton("确定");
		this.button1.setToolTipText("确定");
		this.button1.addActionListener(this);
		panel.add(button1);
		// panel.add(new JLabel(" "));
	}

	/**
	 * 获取小时数组
	 * 
	 * @return
	 */
	private Object[] getHours() {
		Object[] hs = new Object[24];
		for (int i = 0; i < hs.length; i++) {
			hs[i] = i;
		}
		return hs;
	}

	/**
	 * 获取分钟或秒数数组
	 * 
	 * @return
	 */
	private Object[] getMins() {
		Object[] hs = new Object[60];
		for (int i = 0; i < hs.length; i++) {
			hs[i] = i;
		}
		return hs;
	}

	/**
	 * 输出日期的面板
	 *
	 * @return
	 */
	private JPanel printCalendar() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(7, 7, 0, 0));
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		int year2 = calendar.get(Calendar.YEAR);
		int month2 = calendar.get(Calendar.MONTH);
		// 将日期设为当月第一天
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		// 获取第一天是星期几
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		// 打印标头
		JButton b = null;
		for (int i = 0; i < tits.length; i++) {
			b = new JButton("<html><b>" + tits[i] + "</b></html>");
			b.setForeground(new Color(100, 0, 102));
			b.setEnabled(false);
			panel.add(b);
		}
		int count = 0;
		for (int i = Calendar.SUNDAY; i < weekDay; i++) {
			b = new JButton(" ");
			b.setEnabled(false);
			panel.add(b);
			count++;
		}
		int currday = 0;
		String dayStr = null;
		do {
			currday = calendar.get(Calendar.DAY_OF_MONTH);
			dayStr = formatDay(currday);
			// 日,月,年相等则显示
			if (currday == day1 && month1 == month2 && year1 == year2) {
				b = new JButton("[" + dayStr + "]");
				b.setForeground(Color.RED);
			} else {
				b = new JButton(dayStr);
				b.setForeground(Color.BLUE);
			}
			count++;
			b
					.setToolTipText(year2 + "-" + formatDay(month2 + 1) + "-"
							+ dayStr);
			b.setBorder(BorderFactory.createEtchedBorder());
			b.addActionListener(this);
			panel.add(b);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			// 循环完成时月份实际上已经加1
		} while (calendar.get(Calendar.MONTH) == month2);
		// 减1,保持为当前月
		this.calendar.add(Calendar.MONTH, -1);
		for (int i = count; i < 42; i++) {
			b = new JButton(" ");
			b.setEnabled(false);
			panel.add(b);
		}
		return panel;
	}

	/**
	 * 设置显示的数字,若小于10则在前面加0
	 * 
	 * @param day
	 * @return
	 */
	private String formatDay(int day) {
		if (day < 10) {
			return "0" + day;
		}
		return String.valueOf(day);
	}

	/**
	 * 响应点击事件
	 * 
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if ("下一月".equals(command)) {
			// 1.月份加一
			this.calendar.add(Calendar.MONTH, 1);
			// 2.更新显示的年与月
			int year5 = calendar.get(Calendar.YEAR);
			// 判断是否超出显示的最大范围
			int maxYear = this.year1 + 49;
			if (year5 > maxYear) {
				this.calendar.add(Calendar.MONTH, -1);
				return;
			}
			int month5 = calendar.get(Calendar.MONTH) + 1;
			this.comboBox1.setSelectedItem(String.valueOf(year5));
			this.comboBox2.setSelectedItem(" " + this.formatDay(month5));
			// 3.更新界面
			this.updatePanel();
		} else if ("上一月".equals(command)) {
			// 1.月份减一
			this.calendar.add(Calendar.MONTH, -1);
			// 2.更新显示的年与月
			int year5 = calendar.get(Calendar.YEAR);
			// 判断是否超出显示的最大范围
			int minYear = this.year1 - 50;
			if (year5 < minYear) {
				this.calendar.add(Calendar.MONTH, 1);
				return;
			}
			int month5 = calendar.get(Calendar.MONTH) + 1;
			this.comboBox1.setSelectedItem(String.valueOf(year5));
			this.comboBox2.setSelectedItem(" " + this.formatDay(month5));
			// 3.更新界面
			this.updatePanel();
		} else if ("确定".equals(command)) {
			String str = this.calendar.get(Calendar.YEAR) + "-"
					+ this.formatDay(this.calendar.get(Calendar.MONTH) + 1)
					+ "-"
					+ this.formatDay(this.calendar.get(Calendar.DAY_OF_MONTH))
					+ " "
					+ this.formatDay(this.calendar.get(Calendar.HOUR_OF_DAY))
					+ ":" + this.formatDay(this.calendar.get(Calendar.MINUTE))
					+ ":" + this.formatDay(this.calendar.get(Calendar.SECOND));
			JOptionPane.showMessageDialog(this.f, str, "结果",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (command.matches("^\\d+$")) {
			// 修改选择的日期的前景色
			JButton b = (JButton) e.getSource();
			if (this.button4 == null) {
				this.button4 = b;
			} else {
				this.button4.setForeground(Color.BLUE);
				this.button4.setFont(b.getFont());
				this.button4 = b;
			}
			b.setForeground(Color.BLACK);
			b.setFont(button4.getFont().deriveFont(Font.BOLD));
			// 设置日期
			int day9 = Integer.parseInt(command);
			this.calendar.set(Calendar.DAY_OF_MONTH, day9);
		} else if (command.startsWith("[")) {
			// 修改选择的日期的前景色
			JButton b = (JButton) e.getSource();
			if (this.button4 == null) {
				this.button4 = b;
			} else {
				this.button4.setForeground(Color.BLUE);
				this.button4.setFont(b.getFont());
				this.button4 = b;
			}
			b.setForeground(Color.BLACK);
			b.setFont(button4.getFont().deriveFont(Font.BOLD));
			// 处理为当前日期的情况
			this.calendar.set(Calendar.DAY_OF_MONTH, this.day1);
		} else if ("hour".equalsIgnoreCase(command)) {
			// 设置小时值
			int value = Integer.parseInt(this.comboBox3.getSelectedItem()
					.toString().trim());
			this.calendar.set(Calendar.HOUR_OF_DAY, value);
		} else if ("minute".equalsIgnoreCase(command)) {
			// 设置分钟值
			int value = Integer.parseInt(this.comboBox4.getSelectedItem()
					.toString().trim());
			this.calendar.set(Calendar.MINUTE, value);
		} else if ("second".equalsIgnoreCase(command)) {
			// 设置秒数值
			int value = Integer.parseInt(this.comboBox5.getSelectedItem()
					.toString().trim());
			this.calendar.set(Calendar.SECOND, value);
		} else if ("year".equalsIgnoreCase(command)) {
			// 选择年事件
			int value = Integer.parseInt(this.comboBox1.getSelectedItem()
					.toString().trim());
			this.calendar.set(Calendar.YEAR, value);
			this.updatePanel();
		} else if ("month".equalsIgnoreCase(command)) {
			// 选择月事件
			int value = Integer.parseInt(this.comboBox2.getSelectedItem()
					.toString().trim());
			this.calendar.set(Calendar.MONTH, value - 1);
			this.updatePanel();
		}
	}

	/**
	 * 更新界面
	 */
	private void updatePanel() {
		this.f.remove(this.panel);
		this.f.add(this.printCalendar(), BorderLayout.CENTER);
		this.f.validate();
	}

	// 默认宽度与高度
	private static final int DEFAULT_WIDTH = 315;
	private static final int DEFAULT_HEIGHT = 280;
	// 默认显示的年份为100年,即当年的前后50年
	private static final int DEFAULT_SHOW_YEARS = 100;
	// 状态栏与确认按钮
	// 状态栏最多放置17个汉字
	// private JLabel label1 = null;
	private JButton button1 = null;
	private JFrame f = null;
	// 上一个月,下一个月按钮
	private JButton button2 = null;
	private JButton button3 = null;
	// 临时按钮
	private JButton button4 = null;
	// 选择年与月的下拉框
	private JComboBox comboBox1 = null;
	private JComboBox comboBox2 = null;
	// 日历对象
	private Calendar calendar = null;
	// 年与月的选择集合对象
	private String[] years = null;
	private String[] months = null;
	// 当前年,月,日
	private int year1, month1, day1;
	private JPanel panel = null;
	private String tits[] = { "日", "一", "二", "三", "四", "五", "六" };
	// 时,分,秒下拉列表框
	private JComboBox comboBox3 = null;
	private JComboBox comboBox4 = null;
	private JComboBox comboBox5 = null;
	// 下拉框显示的行数
	private int rowlens = 5;
}
