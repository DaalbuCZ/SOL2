.class public final synthetic Lz1/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/o;->n:Lz1/t$a;

    iput-object p2, p0, Lz1/o;->o:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/o;->n:Lz1/t$a;

    iget-object v1, p0, Lz1/o;->o:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lz1/t$a;->d(Lz1/t$a;Ljava/lang/Exception;)V

    return-void
.end method
