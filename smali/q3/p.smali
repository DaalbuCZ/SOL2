.class public final synthetic Lq3/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lq3/x$a;

.field public final synthetic o:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/p;->n:Lq3/x$a;

    iput-object p2, p0, Lq3/p;->o:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq3/p;->n:Lq3/x$a;

    iget-object v1, p0, Lq3/p;->o:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lq3/x$a;->c(Lq3/x$a;Ljava/lang/Exception;)V

    return-void
.end method
