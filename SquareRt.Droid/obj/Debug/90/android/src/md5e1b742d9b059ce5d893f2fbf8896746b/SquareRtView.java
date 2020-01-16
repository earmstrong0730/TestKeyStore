package md5e1b742d9b059ce5d893f2fbf8896746b;


public class SquareRtView
	extends mvvmcross.droid.support.v7.appcompat.MvxAppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("SquareRt.Droid.Views.SquareRtView, SquareRt.Droid", SquareRtView.class, __md_methods);
	}


	public SquareRtView ()
	{
		super ();
		if (getClass () == SquareRtView.class)
			mono.android.TypeManager.Activate ("SquareRt.Droid.Views.SquareRtView, SquareRt.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
