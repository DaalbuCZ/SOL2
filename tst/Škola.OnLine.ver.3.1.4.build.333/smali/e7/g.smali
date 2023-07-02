.class public final synthetic Le7/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Le7/k;

.field public final synthetic o:Le7/c;


# direct methods
.method public synthetic constructor <init>(Le7/k;Le7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/g;->n:Le7/k;

    iput-object p2, p0, Le7/g;->o:Le7/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le7/g;->n:Le7/k;

    iget-object v1, p0, Le7/g;->o:Le7/c;

    invoke-static {v0, v1}, Le7/k;->c(Le7/k;Le7/c;)V

    return-void
.end method
