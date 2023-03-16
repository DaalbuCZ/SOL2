.class public final synthetic Lk5/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li6/a$a;


# instance fields
.field public final synthetic a:Li6/a$a;

.field public final synthetic b:Li6/a$a;


# direct methods
.method public synthetic constructor <init>(Li6/a$a;Li6/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/a0;->a:Li6/a$a;

    iput-object p2, p0, Lk5/a0;->b:Li6/a$a;

    return-void
.end method


# virtual methods
.method public final a(Li6/b;)V
    .locals 2

    iget-object v0, p0, Lk5/a0;->a:Li6/a$a;

    iget-object v1, p0, Lk5/a0;->b:Li6/a$a;

    invoke-static {v0, v1, p1}, Lk5/d0;->d(Li6/a$a;Li6/a$a;Li6/b;)V

    return-void
.end method
