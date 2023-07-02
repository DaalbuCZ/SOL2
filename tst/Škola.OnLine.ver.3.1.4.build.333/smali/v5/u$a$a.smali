.class Lv5/u$a$a;
.super Lv5/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/u$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/Runnable;

.field final synthetic o:Lv5/u$a;


# direct methods
.method constructor <init>(Lv5/u$a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lv5/u$a$a;->o:Lv5/u$a;

    iput-object p2, p0, Lv5/u$a$a;->n:Ljava/lang/Runnable;

    invoke-direct {p0}, Lv5/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lv5/u$a$a;->n:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
