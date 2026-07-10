// returns smallest index where predicate is true
int binarySearch(int lo, int hi, java.util.function.IntPredicate pred) {
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (pred.test(mid)) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
