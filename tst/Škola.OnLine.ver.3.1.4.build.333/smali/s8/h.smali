.class public Ls8/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lt8/k;

.field private final b:Lt8/k$c;


# direct methods
.method public constructor <init>(Lg8/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls8/h$a;

    invoke-direct {v0, p0}, Ls8/h$a;-><init>(Ls8/h;)V

    iput-object v0, p0, Ls8/h;->b:Lt8/k$c;

    new-instance v1, Lt8/k;

    sget-object v2, Lt8/g;->a:Lt8/g;

    const-string v3, "flutter/navigation"

    invoke-direct {v1, p1, v3, v2}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;Lt8/l;)V

    iput-object v1, p0, Ls8/h;->a:Lt8/k;

    invoke-virtual {v1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "NavigationChannel"

    const-string v1, "Sending message to pop route."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ls8/h;->a:Lt8/k;

    const-string v1, "popRoute"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lt8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending message to push route \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NavigationChannel"

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ls8/h;->a:Lt8/k;

    const-string v1, "pushRoute"

    invoke-virtual {v0, v1, p1}, Lt8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending message to set initial route to \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NavigationChannel"

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ls8/h;->a:Lt8/k;

    const-string v1, "setInitialRoute"

    invoke-virtual {v0, v1, p1}, Lt8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
