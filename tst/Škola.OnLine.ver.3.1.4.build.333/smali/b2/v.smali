.class public final synthetic Lb2/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb2/w$a;

.field public final synthetic o:Lb2/w;

.field public final synthetic p:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lb2/w$a;Lb2/w;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/v;->n:Lb2/w$a;

    iput-object p2, p0, Lb2/v;->o:Lb2/w;

    iput-object p3, p0, Lb2/v;->p:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lb2/v;->n:Lb2/w$a;

    iget-object v1, p0, Lb2/v;->o:Lb2/w;

    iget-object v2, p0, Lb2/v;->p:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lb2/w$a;->e(Lb2/w$a;Lb2/w;Ljava/lang/Exception;)V

    return-void
.end method
