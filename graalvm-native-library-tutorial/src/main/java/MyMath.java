import com.google.common.math.IntMath;
import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;

public class MyMath {
    @CEntryPoint (name = "ceilingPowerOfTwo")
    public static int ceilingPowerOfTwo(IsolateThread thread, int x) {
       return IntMath.ceilingPowerOfTwo(x);
    }
}
