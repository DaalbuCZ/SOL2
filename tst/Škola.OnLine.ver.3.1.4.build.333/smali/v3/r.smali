.class public final synthetic Lv3/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/r;->n:Lv3/x$a;

    iput-object p2, p0, Lv3/r;->o:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv3/r;->n:Lv3/x$a;

    iget-object v1, p0, Lv3/r;->o:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lv3/x$a;->c(Lv3/x$a;Ljava/lang/Exception;)V

    return-void
.end method
