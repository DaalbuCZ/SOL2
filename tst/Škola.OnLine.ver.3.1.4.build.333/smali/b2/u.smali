.class public final synthetic Lb2/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb2/w$a;

.field public final synthetic o:Lb2/w;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lb2/w$a;Lb2/w;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/u;->n:Lb2/w$a;

    iput-object p2, p0, Lb2/u;->o:Lb2/w;

    iput p3, p0, Lb2/u;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lb2/u;->n:Lb2/w$a;

    iget-object v1, p0, Lb2/u;->o:Lb2/w;

    iget v2, p0, Lb2/u;->p:I

    invoke-static {v0, v1, v2}, Lb2/w$a;->f(Lb2/w$a;Lb2/w;I)V

    return-void
.end method
