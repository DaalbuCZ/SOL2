.class public final synthetic Le7/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Le7/k;

.field public final synthetic o:Lg7/m;

.field public final synthetic p:Lg7/d;


# direct methods
.method public synthetic constructor <init>(Le7/k;Lg7/m;Lg7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/j;->n:Le7/k;

    iput-object p2, p0, Le7/j;->o:Lg7/m;

    iput-object p3, p0, Le7/j;->p:Lg7/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le7/j;->n:Le7/k;

    iget-object v1, p0, Le7/j;->o:Lg7/m;

    iget-object v2, p0, Le7/j;->p:Lg7/d;

    invoke-static {v0, v1, v2}, Le7/k;->f(Le7/k;Lg7/m;Lg7/d;)V

    return-void
.end method
