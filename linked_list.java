import java.util.*;
	class node{
		String data;
		node next = null;

		node(){}

		node(String data){
			this.data = data;
		}
	}

	class linked_list{

		static node head = new node();

		//display linked list
		public static void display(){
			node ptr = head.next; 
			if(head.next == null){
				System.out.println("srry nothing to display");
			}
			else
			while(ptr != null){
				System.out.print(ptr.data + "\t");
				ptr = ptr.next;
			}
			System.out.println();
		}

		//delete last element of linked list
		public static void delete(){
			if(head.next == null){
				System.out.println("nothing to delete");
			}
			else{
			node ptr = head;
			
			while(ptr.next.next != null){
				ptr = ptr.next;
			}
			ptr.next = null;
		}
	}

		//inserting data into linked list
		public static void insert_into_ll(String str){
			node new_node = new node(str);

			if(head.next == null){
				head.next = new_node;
			}
			else{
				node ptr = head ;
				while(ptr.next != null){
					ptr = ptr.next;
				}
				ptr.next = new_node;
			}

		}
		public static void main(String[] args){
			System.out.println("enter your choice :");
			System.out.println("0.EXIT\n1.INSERT DATA\n2.DELETE DATA FROM END OF LIST\n3.DIAPLAY");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			while(choice != 0){
				 
				switch(choice){
					case 1:System.out.println("enter data to be inserted :");
						String data = sc.next();
						insert_into_ll(data);
					break;

					case 2:System.out.println("the last element of list is deleted ");delete();
					break;

					case 3:System.out.println("the list is :");
						display();
					break;
					default: System.out.println("wrong input TRY again !!!");
					
				}
				System.out.println("enter your choice again :");
				choice = sc.nextInt();

				if(choice == 0){
					System.out.println("EXITED SUCCESSFULLY :)");
				}
			}
			sc.close();
		}
	}