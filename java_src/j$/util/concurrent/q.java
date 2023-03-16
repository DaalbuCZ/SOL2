package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends l {

    /* renamed from: h  reason: collision with root package name */
    private static final Unsafe f9697h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f9698i;

    /* renamed from: e  reason: collision with root package name */
    r f9699e;

    /* renamed from: f  reason: collision with root package name */
    volatile r f9700f;

    /* renamed from: g  reason: collision with root package name */
    volatile Thread f9701g;
    volatile int lockState;

    static {
        try {
            Unsafe c10 = v.c();
            f9697h = c10;
            f9698i = c10.objectFieldOffset(q.class.getDeclaredField("lockState"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar) {
        super(-2, null, null, null);
        int d10;
        int j10;
        this.f9700f = rVar;
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = (r) rVar.f9684d;
            rVar.f9704g = null;
            rVar.f9703f = null;
            if (rVar2 == null) {
                rVar.f9702e = null;
                rVar.f9706i = false;
            } else {
                Object obj = rVar.f9682b;
                int i10 = rVar.f9681a;
                r rVar4 = rVar2;
                Class cls = null;
                while (true) {
                    Object obj2 = rVar4.f9682b;
                    int i11 = rVar4.f9681a;
                    j10 = i11 > i10 ? -1 : i11 < i10 ? 1 : ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) ? j(obj, obj2) : d10;
                    r rVar5 = j10 <= 0 ? rVar4.f9703f : rVar4.f9704g;
                    if (rVar5 == null) {
                        break;
                    }
                    rVar4 = rVar5;
                }
                rVar.f9702e = rVar4;
                if (j10 <= 0) {
                    rVar4.f9703f = rVar;
                } else {
                    rVar4.f9704g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.f9699e = rVar2;
    }

    static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.f9702e;
            if (rVar3 == null) {
                rVar2.f9706i = false;
                return rVar2;
            } else if (rVar2.f9706i) {
                rVar2.f9706i = false;
                return rVar;
            } else {
                r rVar4 = rVar3.f9703f;
                if (rVar4 == rVar2) {
                    rVar4 = rVar3.f9704g;
                    if (rVar4 != null && rVar4.f9706i) {
                        rVar4.f9706i = false;
                        rVar3.f9706i = true;
                        rVar = h(rVar, rVar3);
                        rVar3 = rVar2.f9702e;
                        rVar4 = rVar3 == null ? null : rVar3.f9704g;
                    }
                    if (rVar4 == null) {
                        rVar2 = rVar3;
                    } else {
                        r rVar5 = rVar4.f9703f;
                        r rVar6 = rVar4.f9704g;
                        if ((rVar6 != null && rVar6.f9706i) || (rVar5 != null && rVar5.f9706i)) {
                            if (rVar6 == null || !rVar6.f9706i) {
                                if (rVar5 != null) {
                                    rVar5.f9706i = false;
                                }
                                rVar4.f9706i = true;
                                rVar = i(rVar, rVar4);
                                rVar3 = rVar2.f9702e;
                                rVar4 = rVar3 != null ? rVar3.f9704g : null;
                            }
                            if (rVar4 != null) {
                                rVar4.f9706i = rVar3 == null ? false : rVar3.f9706i;
                                r rVar7 = rVar4.f9704g;
                                if (rVar7 != null) {
                                    rVar7.f9706i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.f9706i = false;
                                rVar = h(rVar, rVar3);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                        rVar4.f9706i = true;
                        rVar2 = rVar3;
                    }
                } else {
                    if (rVar4 != null && rVar4.f9706i) {
                        rVar4.f9706i = false;
                        rVar3.f9706i = true;
                        rVar = i(rVar, rVar3);
                        rVar3 = rVar2.f9702e;
                        rVar4 = rVar3 == null ? null : rVar3.f9703f;
                    }
                    if (rVar4 == null) {
                        rVar2 = rVar3;
                    } else {
                        r rVar8 = rVar4.f9703f;
                        r rVar9 = rVar4.f9704g;
                        if ((rVar8 != null && rVar8.f9706i) || (rVar9 != null && rVar9.f9706i)) {
                            if (rVar8 == null || !rVar8.f9706i) {
                                if (rVar9 != null) {
                                    rVar9.f9706i = false;
                                }
                                rVar4.f9706i = true;
                                rVar = h(rVar, rVar4);
                                rVar3 = rVar2.f9702e;
                                rVar4 = rVar3 != null ? rVar3.f9703f : null;
                            }
                            if (rVar4 != null) {
                                rVar4.f9706i = rVar3 == null ? false : rVar3.f9706i;
                                r rVar10 = rVar4.f9703f;
                                if (rVar10 != null) {
                                    rVar10.f9706i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.f9706i = false;
                                rVar = i(rVar, rVar3);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                        rVar4.f9706i = true;
                        rVar2 = rVar3;
                    }
                }
            }
        }
        return rVar;
    }

    static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.f9706i = true;
        while (true) {
            r rVar4 = rVar2.f9702e;
            if (rVar4 == null) {
                rVar2.f9706i = false;
                return rVar2;
            } else if (!rVar4.f9706i || (rVar3 = rVar4.f9702e) == null) {
                break;
            } else {
                r rVar5 = rVar3.f9703f;
                if (rVar4 == rVar5) {
                    rVar5 = rVar3.f9704g;
                    if (rVar5 == null || !rVar5.f9706i) {
                        if (rVar2 == rVar4.f9704g) {
                            rVar = h(rVar, rVar4);
                            r rVar6 = rVar4.f9702e;
                            rVar3 = rVar6 == null ? null : rVar6.f9702e;
                            rVar4 = rVar6;
                            rVar2 = rVar4;
                        }
                        if (rVar4 != null) {
                            rVar4.f9706i = false;
                            if (rVar3 != null) {
                                rVar3.f9706i = true;
                                rVar = i(rVar, rVar3);
                            }
                        }
                    } else {
                        rVar5.f9706i = false;
                        rVar4.f9706i = false;
                        rVar3.f9706i = true;
                        rVar2 = rVar3;
                    }
                } else if (rVar5 == null || !rVar5.f9706i) {
                    if (rVar2 == rVar4.f9703f) {
                        rVar = i(rVar, rVar4);
                        r rVar7 = rVar4.f9702e;
                        rVar3 = rVar7 == null ? null : rVar7.f9702e;
                        rVar4 = rVar7;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f9706i = false;
                        if (rVar3 != null) {
                            rVar3.f9706i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                } else {
                    rVar5.f9706i = false;
                    rVar4.f9706i = false;
                    rVar3.f9706i = true;
                    rVar2 = rVar3;
                }
            }
        }
        return rVar;
    }

    private final void d() {
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (f9697h.compareAndSwapInt(this, f9698i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f9697h.compareAndSwapInt(this, f9698i, i10, i10 | 2)) {
                    z10 = true;
                    this.f9701g = Thread.currentThread();
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.f9701g = null;
        }
    }

    private final void e() {
        if (f9697h.compareAndSwapInt(this, f9698i, 0, 1)) {
            return;
        }
        d();
    }

    static r h(r rVar, r rVar2) {
        r rVar3 = rVar2.f9704g;
        if (rVar3 != null) {
            r rVar4 = rVar3.f9703f;
            rVar2.f9704g = rVar4;
            if (rVar4 != null) {
                rVar4.f9702e = rVar2;
            }
            r rVar5 = rVar2.f9702e;
            rVar3.f9702e = rVar5;
            if (rVar5 == null) {
                rVar3.f9706i = false;
                rVar = rVar3;
            } else if (rVar5.f9703f == rVar2) {
                rVar5.f9703f = rVar3;
            } else {
                rVar5.f9704g = rVar3;
            }
            rVar3.f9703f = rVar2;
            rVar2.f9702e = rVar3;
        }
        return rVar;
    }

    static r i(r rVar, r rVar2) {
        r rVar3 = rVar2.f9703f;
        if (rVar3 != null) {
            r rVar4 = rVar3.f9704g;
            rVar2.f9703f = rVar4;
            if (rVar4 != null) {
                rVar4.f9702e = rVar2;
            }
            r rVar5 = rVar2.f9702e;
            rVar3.f9702e = rVar5;
            if (rVar5 == null) {
                rVar3.f9706i = false;
                rVar = rVar3;
            } else if (rVar5.f9704g == rVar2) {
                rVar5.f9704g = rVar3;
            } else {
                rVar5.f9703f = rVar3;
            }
            rVar3.f9704g = rVar2;
            rVar2.f9702e = rVar3;
        }
        return rVar;
    }

    static int j(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        l lVar = this.f9700f;
        while (true) {
            r rVar = null;
            if (lVar == null) {
                return null;
            }
            int i11 = this.lockState;
            if ((i11 & 3) == 0) {
                Unsafe unsafe = f9697h;
                long j10 = f9698i;
                if (unsafe.compareAndSwapInt(this, j10, i11, i11 + 4)) {
                    try {
                        r rVar2 = this.f9699e;
                        if (rVar2 != null) {
                            rVar = rVar2.b(i10, obj, null);
                        }
                        if (v.a(unsafe, this, j10, -4) == 6 && (thread2 = this.f9701g) != null) {
                            LockSupport.unpark(thread2);
                        }
                        return rVar;
                    } catch (Throwable th) {
                        if (v.a(f9697h, this, f9698i, -4) == 6 && (thread = this.f9701g) != null) {
                            LockSupport.unpark(thread);
                        }
                        throw th;
                    }
                }
            } else if (lVar.f9681a != i10 || ((obj2 = lVar.f9682b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                lVar = lVar.f9684d;
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7 A[LOOP:0: B:3:0x000c->B:55:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.r f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.r r2 = r1.f9699e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        Lc:
            if (r10 != 0) goto L22
            j$.util.concurrent.r r9 = new j$.util.concurrent.r
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f9699e = r9
            r1.f9700f = r9
            goto La2
        L22:
            int r5 = r10.f9681a
            r11 = 1
            if (r5 <= r0) goto L2a
            r5 = -1
        L28:
            r12 = r5
            goto L68
        L2a:
            if (r5 >= r0) goto L2e
            r12 = r11
            goto L68
        L2e:
            java.lang.Object r5 = r10.f9682b
            if (r5 == r4) goto Laa
            if (r5 == 0) goto L3c
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3c
            goto Laa
        L3c:
            if (r2 != 0) goto L44
            java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.c(r17)
            if (r2 == 0) goto L4a
        L44:
            int r6 = j$.util.concurrent.ConcurrentHashMap.d(r2, r4, r5)
            if (r6 != 0) goto L67
        L4a:
            if (r3 != 0) goto L62
            j$.util.concurrent.r r3 = r10.f9703f
            if (r3 == 0) goto L56
            j$.util.concurrent.r r3 = r3.b(r0, r4, r2)
            if (r3 != 0) goto L60
        L56:
            j$.util.concurrent.r r3 = r10.f9704g
            if (r3 == 0) goto L61
            j$.util.concurrent.r r3 = r3.b(r0, r4, r2)
            if (r3 == 0) goto L61
        L60:
            return r3
        L61:
            r3 = r11
        L62:
            int r5 = j(r4, r5)
            goto L28
        L67:
            r12 = r6
        L68:
            if (r12 > 0) goto L6d
            j$.util.concurrent.r r5 = r10.f9703f
            goto L6f
        L6d:
            j$.util.concurrent.r r5 = r10.f9704g
        L6f:
            if (r5 != 0) goto La7
            j$.util.concurrent.r r13 = r1.f9700f
            j$.util.concurrent.r r14 = new j$.util.concurrent.r
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f9700f = r14
            if (r13 == 0) goto L87
            r13.f9705h = r14
        L87:
            if (r12 > 0) goto L8c
            r10.f9703f = r14
            goto L8e
        L8c:
            r10.f9704g = r14
        L8e:
            boolean r0 = r10.f9706i
            if (r0 != 0) goto L95
            r14.f9706i = r11
            goto La2
        L95:
            r15.e()
            j$.util.concurrent.r r0 = r1.f9699e     // Catch: java.lang.Throwable -> La3
            j$.util.concurrent.r r0 = c(r0, r14)     // Catch: java.lang.Throwable -> La3
            r1.f9699e = r0     // Catch: java.lang.Throwable -> La3
            r1.lockState = r9
        La2:
            return r8
        La3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        La7:
            r10 = r5
            goto Lc
        Laa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(j$.util.concurrent.r r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.g(j$.util.concurrent.r):boolean");
    }
}
