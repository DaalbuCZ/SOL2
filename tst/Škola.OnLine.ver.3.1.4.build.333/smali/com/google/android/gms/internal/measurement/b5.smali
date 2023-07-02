.class public final Lcom/google/android/gms/internal/measurement/b5;
.super Lcom/google/android/gms/internal/measurement/i9;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pa;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/b5;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/measurement/o9;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/b5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/b5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/b5;->zza:Lcom/google/android/gms/internal/measurement/b5;

    const-class v1, Lcom/google/android/gms/internal/measurement/b5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/i9;->v(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/i9;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i9;->p()Lcom/google/android/gms/internal/measurement/o9;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->zzd:Lcom/google/android/gms/internal/measurement/o9;

    return-void
.end method

.method public static E()Lcom/google/android/gms/internal/measurement/a5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/b5;->zza:Lcom/google/android/gms/internal/measurement/b5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i9;->A()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/a5;

    return-object v0
.end method

.method static synthetic F()Lcom/google/android/gms/internal/measurement/b5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/b5;->zza:Lcom/google/android/gms/internal/measurement/b5;

    return-object v0
.end method

.method static synthetic I(Lcom/google/android/gms/internal/measurement/b5;Lcom/google/android/gms/internal/measurement/d5;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->zzd:Lcom/google/android/gms/internal/measurement/o9;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/o9;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/i9;->q(Lcom/google/android/gms/internal/measurement/o9;)Lcom/google/android/gms/internal/measurement/o9;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->zzd:Lcom/google/android/gms/internal/measurement/o9;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/b5;->zzd:Lcom/google/android/gms/internal/measurement/o9;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method protected final D(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/b5;->zza:Lcom/google/android/gms/internal/measurement/b5;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/a5;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/a5;-><init>(Lcom/google/android/gms/internal/measurement/j4;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/b5;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/b5;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-class p3, Lcom/google/android/gms/internal/measurement/d5;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/measurement/b5;->zza:Lcom/google/android/gms/internal/measurement/b5;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/i9;->s(Lcom/google/android/gms/internal/measurement/oa;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final G(I)Lcom/google/android/gms/internal/measurement/d5;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/b5;->zzd:Lcom/google/android/gms/internal/measurement/o9;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/d5;

    return-object p1
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b5;->zzd:Lcom/google/android/gms/internal/measurement/o9;

    return-object v0
.end method
