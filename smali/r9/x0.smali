.class public final Lr9/x0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lr9/x0;

.field private static final b:Lr9/d0;

.field private static final c:Lr9/d0;

.field private static final d:Lr9/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/x0;

    invoke-direct {v0}, Lr9/x0;-><init>()V

    sput-object v0, Lr9/x0;->a:Lr9/x0;

    sget-object v0, Lkotlinx/coroutines/scheduling/c;->v:Lkotlinx/coroutines/scheduling/c;

    sput-object v0, Lr9/x0;->b:Lr9/d0;

    sget-object v0, Lr9/h2;->p:Lr9/h2;

    sput-object v0, Lr9/x0;->c:Lr9/d0;

    sget-object v0, Lkotlinx/coroutines/scheduling/b;->q:Lkotlinx/coroutines/scheduling/b;

    sput-object v0, Lr9/x0;->d:Lr9/d0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lr9/d0;
    .locals 1

    sget-object v0, Lr9/x0;->b:Lr9/d0;

    return-object v0
.end method

.method public static final b()Lr9/d0;
    .locals 1

    sget-object v0, Lr9/x0;->d:Lr9/d0;

    return-object v0
.end method

.method public static final c()Lr9/z1;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/v;->c:Lr9/z1;

    return-object v0
.end method
