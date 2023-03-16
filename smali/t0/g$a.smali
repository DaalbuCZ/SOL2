.class Lt0/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final n:Lt0/g;

.field final o:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lt0/g;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/g$a;->n:Lt0/g;

    iput-object p2, p0, Lt0/g$a;->o:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lt0/g$a;->o:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt0/g$a;->n:Lt0/g;

    invoke-virtual {v0}, Lt0/g;->b()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lt0/g$a;->n:Lt0/g;

    invoke-virtual {v1}, Lt0/g;->b()V

    throw v0
.end method
