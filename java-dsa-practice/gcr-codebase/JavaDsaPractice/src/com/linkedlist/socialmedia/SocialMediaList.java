package com.linkedlist.socialmedia;

public class SocialMediaList {
	private Node head;
	 
	public void addUser(int id,String name,int age) {
		Node newUser=new Node(id,name,age);
		if(head==null) {
			head=newUser;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		
		}
		temp.next=newUser;
	}
		public Node findUserId(int id) {
			Node temp=head;
			while(temp!=null) {
				if(temp.id==id)
					return temp;
				temp=temp.next;
				
			}
			return null;
		}
		public void serachByName(String name) {
			Node temp=head;
			while(temp!=null) {
				if(temp.name==name) {
					displayUser(temp);
					return;
					
				}
				temp=temp.next;
			}
			System.out.println("user not found");
		}
		public void addFriendConnection(int id1,int id2) {
			Node u1=findUserId(id1);
			Node u2=findUserId(id2);
			if(u1==null || u2==null) {
				System.out.println("user not found");
				return;
			}

	        addFriend(u1, id2);
	        addFriend(u2, id1);
	        System.out.println("Friend connection added");
	    }

	    private void addFriend(Node user, int friendId) {
	        FriendNode newFriend = new FriendNode(friendId);
	        newFriend.next = user.friendHead;
	        user.friendHead = newFriend;
	    }

	    public void removeFriendConnection(int id1, int id2) {
	        Node u1 = findUserId(id1);
	       Node u2 = findUserId(id2);

	        if (u1 == null || u2 == null) {
	            System.out.println("User not found");
	            return;
	        }

	        removeFriend(u1, id2);
	        removeFriend(u2, id1);
	        System.out.println("Friend connection removed");
	    }

	    private void removeFriend(Node user, int friendId) {
	        FriendNode temp=user.friendHead, prev = null;

	        while (temp!=null) {
	            if (temp.friendId == friendId) {
	                if (prev == null)
	                    user.friendHead = temp.next;
	                else
	                    prev.next = temp.next;
	                return;
	            }
	            prev = temp;
	            temp = temp.next;
	        }
	    }
	    public void displayFriends(int userId) {
	        Node user = findUserId(userId);
	        if (user== null) {
	            System.out.println("User not found");
	            return;
	        }

	        System.out.print("Friends of " + user.name + ": ");
	        FriendNode temp = user.friendHead;
	        if (temp==null) {
	            System.out.println("No friends");
	            return;
	        }

	        while (temp != null) {
	            System.out.print(temp.friendId + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public void findMutualFriends(int id1, int id2) {
	        Node u1 = findUserId(id1);
	        Node u2 = findUserId(id2);

	        if (u1 == null || u2 == null) {
	            System.out.println("User not found");
	            return;
	        }

	        System.out.print("Mutual Friends: ");
	        FriendNode f1 = u1.friendHead;

	        boolean found = false;
	        while (f1 != null) {
	            FriendNode f2 = u2.friendHead;
	            while (f2 != null) {
	                if (f1.friendId == f2.friendId) {
	                    System.out.print(f1.friendId + " ");
	                    found = true;
	                }
	                f2 = f2.next;
	            }
	            f1 = f1.next;
	        }

	        if (!found)
	            System.out.print("None");

	        System.out.println();
	    }

	  
	    public void countFriends() {
	        Node temp = head;
	        while (temp != null) {
	            int count = 0;
	            FriendNode f = temp.friendHead;
	            while (f != null) {
	                count++;
	                f = f.next;
	            }
	            System.out.println(temp.name + " has " + count + " friends");
	            temp = temp.next;
	        }
	    }
	    private void displayUser(Node user) {
	    	System.out.println("user id : "+ user.id);
	    	System.out.println("Name : "+ user.name);
	    	System.out.println("age  : "+ user.age);
				
			
		
	}

}
