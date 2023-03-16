.class public final synthetic Lj$/util/stream/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/n;


# static fields
.field public static final synthetic a:Lj$/util/stream/b0;

.field public static final synthetic b:Lj$/util/stream/b0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/b0;

    invoke-direct {v0}, Lj$/util/stream/b0;-><init>()V

    sput-object v0, Lj$/util/stream/b0;->a:Lj$/util/stream/b0;

    .line 2
    new-instance v0, Lj$/util/stream/b0;

    invoke-direct {v0}, Lj$/util/stream/b0;-><init>()V

    sput-object v0, Lj$/util/stream/b0;->b:Lj$/util/stream/b0;

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

    sget v0, Lj$/util/stream/j0;->t:I

    const/4 v0, 0x2

    new-array v0, v0, [J

    return-object v0
.end method

.method public u(I)Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/y2;->w:I

    .line 1
    new-array p1, p1, [Ljava/lang/Double;

    return-object p1
.end method
