.class public final synthetic Lj$/util/stream/L;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/n;


# static fields
.field public static final synthetic a:Lj$/util/stream/L;

.field public static final synthetic b:Lj$/util/stream/L;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/L;

    invoke-direct {v0}, Lj$/util/stream/L;-><init>()V

    sput-object v0, Lj$/util/stream/L;->a:Lj$/util/stream/L;

    .line 2
    new-instance v0, Lj$/util/stream/L;

    invoke-direct {v0}, Lj$/util/stream/L;-><init>()V

    sput-object v0, Lj$/util/stream/L;->b:Lj$/util/stream/L;

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

    new-instance v0, Lj$/util/stream/Q;

    invoke-direct {v0}, Lj$/util/stream/Q;-><init>()V

    return-object v0
.end method

.method public u(I)Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/w2;->w:I

    .line 1
    new-array p1, p1, [Ljava/lang/Long;

    return-object p1
.end method
