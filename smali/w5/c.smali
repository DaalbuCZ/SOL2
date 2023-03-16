.class public final synthetic Lw5/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le1/h;


# instance fields
.field public final synthetic a:Lw5/e;

.field public final synthetic b:Lt4/j;

.field public final synthetic c:Lq5/p;


# direct methods
.method public synthetic constructor <init>(Lw5/e;Lt4/j;Lq5/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/c;->a:Lw5/e;

    iput-object p2, p0, Lw5/c;->b:Lt4/j;

    iput-object p3, p0, Lw5/c;->c:Lq5/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lw5/c;->a:Lw5/e;

    iget-object v1, p0, Lw5/c;->b:Lt4/j;

    iget-object v2, p0, Lw5/c;->c:Lq5/p;

    invoke-static {v0, v1, v2, p1}, Lw5/e;->a(Lw5/e;Lt4/j;Lq5/p;Ljava/lang/Exception;)V

    return-void
.end method
