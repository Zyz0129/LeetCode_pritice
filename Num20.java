package LeetCode;

public class Num20 {

    public boolean isValid(String s) {
        Stack st=new Stack<>();
        st.push('1');
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else{
                char t= (char) st.pop();
                if(s.charAt(i)==')'&&t!='('){
                    return false;
                }if(s.charAt(i)==']'&&t!='['){
                    return false;
                }if(s.charAt(i)=='}'&&t!='{'){
                    return false;
                }
            }
        }
        return st.N==1;
    }
   static class Stack<T>{
        private class Node{
            T data;
            Node next;

            public Node(T data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
        private Node head;
        private int N;

        public Stack() {
            head=new Node(null,null);
            N=0;
        }
        public boolean isEmpty(){
            return this.N==0;
        }
        public void push(T t){
            if(this.isEmpty()){
                Node node=new Node(t,null);
                head.next=node;
            }else {
                Node node=new Node(t,head.next);
                head.next=node;
            }
            N++;
        }
        public int length(){
            return N;
        }
        public T pop(){
            if(this.isEmpty()){
                return null;
            }else{
                Node curr=head.next;
                head.next=curr.next;
                N--;
                return curr.data;
            }
        }
    }
}
