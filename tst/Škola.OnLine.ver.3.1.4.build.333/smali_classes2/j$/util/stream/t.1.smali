.class public final synthetic Lj$/util/stream/t;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/BiConsumer;
.implements Lj$/util/function/n;


# static fields
.field public static final synthetic a:Lj$/util/stream/t;

.field public static final synthetic b:Lj$/util/stream/t;

.field public static final synthetic c:Lj$/util/stream/t;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/t;

    invoke-direct {v0}, Lj$/util/stream/t;-><init>()V

    sput-object v0, Lj$/util/stream/t;->a:Lj$/util/stream/t;

    .line 2
    new-instance v0, Lj$/util/stream/t;

    invoke-direct {v0}, Lj$/util/stream/t;-><init>()V

    sput-object v0, Lj$/util/stream/t;->b:Lj$/util/stream/t;

    .line 3
    new-instance v0, Lj$/util/stream/t;

    invoke-direct {v0}, Lj$/util/stream/t;-><init>()V

    sput-object v0, Lj$/util/stream/t;->c:Lj$/util/stream/t;

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

    const/4 v0, 0x3

    new-array v0, v0, [D

    return-object v0
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj$/util/i;

    check-cast p2, Lj$/util/i;

    invoke-virtual {p1, p2}, Lj$/util/i;->a(Lj$/util/i;)V

    return-void
.end method

.method public u(I)Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/s0;->t:I

    .line 1
    new-array p1, p1, [Ljava/lang/Long;

    return-object p1
.end method
