.class public final synthetic Lr1/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Lr1/c;

.field public final synthetic b:Ll1/p;

.field public final synthetic c:Ll1/i;


# direct methods
.method public synthetic constructor <init>(Lr1/c;Ll1/p;Ll1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/b;->a:Lr1/c;

    iput-object p2, p0, Lr1/b;->b:Ll1/p;

    iput-object p3, p0, Lr1/b;->c:Ll1/i;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lr1/b;->a:Lr1/c;

    iget-object v1, p0, Lr1/b;->b:Ll1/p;

    iget-object v2, p0, Lr1/b;->c:Ll1/i;

    invoke-static {v0, v1, v2}, Lr1/c;->c(Lr1/c;Ll1/p;Ll1/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
