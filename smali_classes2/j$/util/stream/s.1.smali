.class public final synthetic Lj$/util/stream/s;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/BiConsumer;
.implements Lj$/util/function/n;


# static fields
.field public static final synthetic a:Lj$/util/stream/s;

.field public static final synthetic b:Lj$/util/stream/s;

.field public static final synthetic c:Lj$/util/stream/s;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/s;

    invoke-direct {v0}, Lj$/util/stream/s;-><init>()V

    sput-object v0, Lj$/util/stream/s;->a:Lj$/util/stream/s;

    .line 2
    new-instance v0, Lj$/util/stream/s;

    invoke-direct {v0}, Lj$/util/stream/s;-><init>()V

    sput-object v0, Lj$/util/stream/s;->b:Lj$/util/stream/s;

    .line 3
    new-instance v0, Lj$/util/stream/s;

    invoke-direct {v0}, Lj$/util/stream/s;-><init>()V

    sput-object v0, Lj$/util/stream/s;->c:Lj$/util/stream/s;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/F;->t:I

    const/4 v0, 0x4

    new-array v0, v0, [D

    return-object v0
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    check-cast p1, [D

    check-cast p2, [D

    sget v0, Lj$/util/stream/F;->t:I

    const/4 v0, 0x0

    .line 1
    aget-wide v0, p2, v0

    invoke-static {p1, v0, v1}, Lj$/util/stream/m;->b([DD)[D

    const/4 v0, 0x1

    aget-wide v0, p2, v0

    invoke-static {p1, v0, v1}, Lj$/util/stream/m;->b([DD)[D

    const/4 v0, 0x2

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-double/2addr v1, v3

    aput-wide v1, p1, v0

    return-void
.end method

.method public u(I)Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/j0;->t:I

    .line 1
    new-array p1, p1, [Ljava/lang/Integer;

    return-object p1
.end method
