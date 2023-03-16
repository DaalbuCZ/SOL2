.class public Ly0/o3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/o3$a;,
        Ly0/o3$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Ly0/o3;->a:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Ly0/o3;->b:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Ly0/o3;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ly0/o3;->b:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public b(Landroid/view/View;Ly0/o3$a;)V
    .locals 2

    iget-object v0, p0, Ly0/o3;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ly0/o3$b;

    invoke-direct {v1, p0, p1, p2}, Ly0/o3$b;-><init>(Ly0/o3;Landroid/view/View;Ly0/o3$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
