package code.interview.test;

import java.util.Objects;

//creating immutable class
public final class UserDetailsUsingImmutable {
	
	private static final String FIRST_USER = "deenu";
	
	private static final String SECOND_USER = "anu";

	private final String user;

	private final String post;

	public UserDetailsUsingImmutable(String user, String post) {
		this.user = user;
		this.post = post;
	}

	public String getUser() {
		return user;
	}

	public String getPost() {
		return post;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsUsingImmutable that = (UserDetailsUsingImmutable) o;
		return Objects.equals(user, that.user) && Objects.equals(post, that.post);
	}

	@Override
	public int hashCode() {
		return Objects.hash(user, post);
	}
	
	public static void main(String[] args) {
		UserDetailsUsingImmutable uob1 = new UserDetailsUsingImmutable(FIRST_USER, "se");
		UserDetailsUsingImmutable uob2 = new UserDetailsUsingImmutable(FIRST_USER, "se");
		
		System.out.println("are they same user: " + uob1.equals(uob2));
		System.out.println("user1 hashcode: " + uob1.hashCode() + ", user2 hashcode: " + uob2.hashCode());
		
		UserDetailsUsingImmutable uob3 = new UserDetailsUsingImmutable(SECOND_USER, "se");
		UserDetailsUsingImmutable uob4 = new UserDetailsUsingImmutable(FIRST_USER, "se");
		
		System.out.println("are they same user: " + uob3.equals(uob4));
		System.out.println("user1 hashcode: " + uob3.hashCode() + ", user2 hashcode: " + uob4.hashCode());

	}
}
