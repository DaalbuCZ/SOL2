.class public final synthetic Lz6/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz6/k;

.field public final synthetic o:Lb7/m;

.field public final synthetic p:Lb7/d;


# direct methods
.method public synthetic constructor <init>(Lz6/k;Lb7/m;Lb7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/i;->n:Lz6/k;

    iput-object p2, p0, Lz6/i;->o:Lb7/m;

    iput-object p3, p0, Lz6/i;->p:Lb7/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz6/i;->n:Lz6/k;

    iget-object v1, p0, Lz6/i;->o:Lb7/m;

    iget-object v2, p0, Lz6/i;->p:Lb7/d;

    invoke-static {v0, v1, v2}, Lz6/k;->f(Lz6/k;Lb7/m;Lb7/d;)V

    return-void
.end method
