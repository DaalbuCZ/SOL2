.class final Ly4/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/f0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ly4/a;

.field private final c:Ly4/j0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ly4/a;Ly4/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/s;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ly4/s;->b:Ly4/a;

    iput-object p3, p0, Ly4/s;->c:Ly4/j0;

    return-void
.end method

.method static bridge synthetic a(Ly4/s;)Ly4/a;
    .locals 0

    iget-object p0, p0, Ly4/s;->b:Ly4/a;

    return-object p0
.end method

.method static bridge synthetic b(Ly4/s;)Ly4/j0;
    .locals 0

    iget-object p0, p0, Ly4/s;->c:Ly4/j0;

    return-object p0
.end method


# virtual methods
.method public final c(Ly4/i;)V
    .locals 2

    iget-object v0, p0, Ly4/s;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ly4/r;

    invoke-direct {v1, p0, p1}, Ly4/r;-><init>(Ly4/s;Ly4/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
