.class Lz0/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lz0/b;


# direct methods
.method constructor <init>(Lz0/b;)V
    .locals 0

    iput-object p1, p0, Lz0/b$a;->n:Lz0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lz0/b$a;->n:Lz0/b;

    invoke-virtual {v0, p1}, Lz0/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
