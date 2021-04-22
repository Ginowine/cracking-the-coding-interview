package DataStructures;

public class FirstBadVersion {

    public int checkFirstBadVersion(int n){
        int left = 1;
        int right = n;
        while (left < right){
                int mid = left + (right - left) / 2;
                if (!isBadVersion(mid)){
                    left = mid + 1;
                }else {
                    right = mid;
                }
        }
        return left;
    }
}
