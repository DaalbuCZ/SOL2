.class public Lm0/i;
.super Ll0/e;
.source ""


# instance fields
.field private a:Landroid/webkit/WebResourceError;

.field private b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;


# direct methods
.method public constructor <init>(Landroid/webkit/WebResourceError;)V
    .locals 0

    invoke-direct {p0}, Ll0/e;-><init>()V

    iput-object p1, p0, Lm0/i;->a:Landroid/webkit/WebResourceError;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/InvocationHandler;)V
    .locals 1

    invoke-direct {p0}, Ll0/e;-><init>()V

    const-class v0, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    invoke-static {v0, p1}, Lja/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    iput-object p1, p0, Lm0/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    return-void
.end method

.method private c()Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;
    .locals 3

    iget-object v0, p0, Lm0/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    if-nez v0, :cond_0

    const-class v0, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    invoke-static {}, Lm0/k;->c()Lm0/n;

    move-result-object v1

    iget-object v2, p0, Lm0/i;->a:Landroid/webkit/WebResourceError;

    invoke-virtual {v1, v2}, Lm0/n;->e(Landroid/webkit/WebResourceError;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-static {v0, v1}, Lja/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    iput-object v0, p0, Lm0/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lm0/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    return-object v0
.end method

.method private d()Landroid/webkit/WebResourceError;
    .locals 2

    iget-object v0, p0, Lm0/i;->a:Landroid/webkit/WebResourceError;

    if-nez v0, :cond_0

    invoke-static {}, Lm0/k;->c()Lm0/n;

    move-result-object v0

    iget-object v1, p0, Lm0/i;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm0/n;->d(Ljava/lang/reflect/InvocationHandler;)Landroid/webkit/WebResourceError;

    move-result-object v0

    iput-object v0, p0, Lm0/i;->a:Landroid/webkit/WebResourceError;

    :cond_0
    iget-object v0, p0, Lm0/i;->a:Landroid/webkit/WebResourceError;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/CharSequence;
    .locals 2

    sget-object v0, Lm0/j;->v:Lm0/a$b;

    invoke-virtual {v0}, Lm0/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lm0/i;->d()Landroid/webkit/WebResourceError;

    move-result-object v0

    invoke-static {v0}, Lm0/b;->e(Landroid/webkit/WebResourceError;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lm0/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lm0/i;->c()Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;->getDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lm0/j;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public b()I
    .locals 2

    sget-object v0, Lm0/j;->w:Lm0/a$b;

    invoke-virtual {v0}, Lm0/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lm0/i;->d()Landroid/webkit/WebResourceError;

    move-result-object v0

    invoke-static {v0}, Lm0/b;->f(Landroid/webkit/WebResourceError;)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lm0/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lm0/i;->c()Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;->getErrorCode()I

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lm0/j;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method
