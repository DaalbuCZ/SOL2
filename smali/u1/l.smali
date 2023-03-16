.class public final synthetic Lu1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu1/s$a;

.field public final synthetic o:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lu1/s$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/l;->n:Lu1/s$a;

    iput-object p2, p0, Lu1/l;->o:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/l;->n:Lu1/s$a;

    iget-object v1, p0, Lu1/l;->o:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lu1/s$a;->d(Lu1/s$a;Ljava/lang/Exception;)V

    return-void
.end method
