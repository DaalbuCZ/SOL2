.class final Lkotlinx/coroutines/scheduling/m;
.super Lz9/d0;
.source ""


# static fields
.field public static final p:Lkotlinx/coroutines/scheduling/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/scheduling/m;

    invoke-direct {v0}, Lkotlinx/coroutines/scheduling/m;-><init>()V

    sput-object v0, Lkotlinx/coroutines/scheduling/m;->p:Lkotlinx/coroutines/scheduling/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz9/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lj9/g;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lkotlinx/coroutines/scheduling/c;->v:Lkotlinx/coroutines/scheduling/c;

    sget-object v0, Lkotlinx/coroutines/scheduling/l;->g:Lkotlinx/coroutines/scheduling/i;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lkotlinx/coroutines/scheduling/f;->Z(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V

    return-void
.end method
