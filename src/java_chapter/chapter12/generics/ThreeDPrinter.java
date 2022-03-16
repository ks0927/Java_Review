package java_chapter.chapter12.generics;

public class ThreeDPrinter<T> {
/*
	private Object material; //object는 최상위 클래스니까...
							//모든 참조자료형을 받고싶을때

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	public class ThreeDPrinter<T extends Powder> 이런식으로 상속받은 얘들만 쓸수있게 T를 제한해 줄수도있음
	*/

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
    @Override
    public String toString() {
        return material.toString();

    }

}
