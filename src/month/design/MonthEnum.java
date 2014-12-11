package month.design;


public class MonthEnum {
	Month month;

	public MonthEnum(Month month) {
		super();
		this.month = month;
	}

	public void whicMonth() {
		switch (month) {
		case JANUARY:
			System.out.println("FIRST MONTH OF THE YEAR.");
			break;

		case FEBRUARY:
			System.out.println("SECOND MONTH OF THE YEAR..");
			break;

		case MARCH:
			System.out.println("THIRD MONTH OF THE YEAR");
			break;

		case APRIL:
			System.out.println("FOUTH MONTH OF THE YEAR");
			break;
		case MAY:
			System.out.println("FIFTH MONTH OF THE YEAR");
			break;

		case JUNE:
			System.out.println("SIXTH MONTH OF THE YEAR");
			break;

		case JULY:
			System.out.println("SEVENTH MONTH OF THE YEAR");
			break;
		case AUGUST:
			System.out.println("EITGH MONTH OF THE YEAR");
			break;
		case SEPTEMBER:
			System.out.println("NINTH MONTH OF THE YEAR");
			break;
		case OCTOBER:
			System.out.println("TENTH MONTH OF THE YEAR");
			break;
		case NOVEMBER:
			System.out.println("ELEVEN MONTH OF THE YEAR");
			break;
		case DECEMBER:
			System.out.println("TWELVE  MONTH OF THE YEAR");
			break;

		default:
			System.out.println("INVALID MONTH.");
			break;
		}
	}
}
