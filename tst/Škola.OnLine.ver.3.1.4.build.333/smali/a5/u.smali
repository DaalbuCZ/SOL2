.class public final synthetic La5/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/d;


# instance fields
.field public final synthetic a:La5/d0;

.field public final synthetic b:Ly4/j;


# direct methods
.method public synthetic constructor <init>(La5/d0;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/u;->a:La5/d0;

    iput-object p2, p0, La5/u;->b:Ly4/j;

    return-void
.end method


# virtual methods
.method public final a(Ly4/i;)V
    .locals 2

    iget-object v0, p0, La5/u;->a:La5/d0;

    iget-object v1, p0, La5/u;->b:Ly4/j;

    invoke-virtual {v0, v1, p1}, La5/d0;->q(Ly4/j;Ly4/i;)V

    return-void
.end method
