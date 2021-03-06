package a00980032.data;

import java.time.LocalDate;

/**
 * @author Chris Noble, A00980032
 *
 *
 */
public class Customer
{

	public static final int ATTRIBUTE_COUNT = 9;

	private long id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String postalCode;
	private String phone;
	private String emailAddress;
	private LocalDate joinedDate;

	public static class Builder
	{
		// Required parameters
		private final long id;
		private final String phone;

		// Optional parameters
		private String firstName;
		private String lastName;
		private String street;
		private String city;
		private String postalCode;
		private String emailAddress;
		private LocalDate joinedDate;

		public Builder(long id, String phone)
		{
			this.id = id;
			this.phone = phone;
		}

		/**
		 * @param firstName
		 *            the firstName to set
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setFirstName(String firstName)
		{
			this.firstName = firstName;
			return this;
		}

		/**
		 * @param lastName
		 *            the lastName to set
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setLastName(String lastName)
		{
			this.lastName = lastName;
			return this;
		}

		/**
		 * @param street
		 *            the street to set
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setStreet(String street)
		{
			this.street = street;
			return this;
		}

		/**
		 * @param city
		 *            the city to set
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setCity(String city)
		{
			this.city = city;
			return this;
		}

		/**
		 * @param postalCode
		 *            the postalCode to set
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setPostalCode(String postalCode)
		{
			this.postalCode = postalCode;
			return this;
		}

		/**
		 * @param emailAddress
		 *            the emailAddress to set
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setEmailAddress(String emailAddress)
		{
			this.emailAddress = emailAddress;
			return this;
		}

		/**
		 * Set the joined date
		 *
		 * @param year
		 *            the year, includes the century, ex. 1967
		 * @param month
		 *            the month - must be 1-based
		 * @param day
		 *            the day of the month - 1-based
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setJoinedDate(int year, int month, int day)
		{
			joinedDate = LocalDate.of(year, month, day);
			return this;
		}

		/**
		 * Set the joined date
		 *
		 * @param date
		 *            the local date
		 * @return the Customer.Builder object to allow for method chaining.
		 */
		public Builder setJoinedDate(LocalDate date)
		{
			joinedDate = date;
			return this;
		}

		/**
		 * Build the Customer object.
		 * 
		 * @return the Customer object.
		 */
		public Customer build()
		{
			return new Customer(this);
		}
	}

	/**
	 * Default Constructor
	 */
	private Customer(Builder builder)
	{
		id = builder.id;
		firstName = builder.firstName;
		lastName = builder.lastName;
		street = builder.street;
		city = builder.city;
		postalCode = builder.postalCode;
		phone = builder.phone;
		emailAddress = builder.emailAddress;
		joinedDate = builder.joinedDate;
	}

	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @return the street
	 */
	public String getStreet()
	{
		return street;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode()
	{
		return postalCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress()
	{
		return emailAddress;
	}

	public LocalDate getJoinedDate()
	{
		return joinedDate;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", street=" + street + ", city=" + city
				+ ", postalCode=" + postalCode + ", phone=" + phone + ", emailAddress=" + emailAddress + ", joinedDate=" + joinedDate + "]";
	}

}
